# Task 5: Clean Up and Push Back to Remote Git

This lab exercise demonstrates how to synchronize local repository changes with a remote GitHub repository after completing local branching, merging, and conflict resolution.

## Lab Objectives

* Verify that the local `main` branch is in a clean working state.
* List and inspect all local and remote branches.
* Pull latest remote changes to ensure local branch alignment.
* Push local commits to the remote repository (`origin/main`).
* Verify that changes are reflected in the remote GitHub interface.

## Tools Used

* **OS:** Windows
* **Terminal:** Git Bash
* **Version Control:** Git & GitHub

## Execution & Command Log

# 1. Verify working directory state
git checkout main
git status

# 2. List all local and remote branches
git branch -a

# 3. Pull latest remote changes
git pull origin main --rebase

# 4. Push local changes to remote repository
git push origin main

# 5. Final status check
git status
