#!/bin/bash

# === CONFIGURE YOUR NAME AND EMAIL HERE ===
AUTHOR_NAME="Rudraksh Menon"
AUTHOR_EMAIL="rudrakshmenon@gmail.com"

echo "Starting cleanup with author: $AUTHOR_NAME <$AUTHOR_EMAIL>"

# Step 1: Rewrite history for all branches
git filter-branch --env-filter "
GIT_AUTHOR_NAME=\"$AUTHOR_NAME\"
GIT_AUTHOR_EMAIL=\"$AUTHOR_EMAIL\"
GIT_COMMITTER_NAME=\"$AUTHOR_NAME\"
GIT_COMMITTER_EMAIL=\"$AUTHOR_EMAIL\"
" -- --all

# Step 2: Remove old refs
echo "Cleaning old refs..."
rm -rf .git/refs/original/
git reflog expire --expire=now --all
git gc --prune=now --aggressive

# Step 3: Force push all branches and tags
echo "Force pushing all branches and tags..."
git push --force --all
git push --force --tags

echo "Cleanup completed! Check GitHub after a few minutes."
