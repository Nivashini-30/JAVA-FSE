# Task 2: Implementing .gitignore in Git

This lab exercise demonstrates how to use a `.gitignore` file to ignore unwanted files (such as `.log` files) and directories (`log/`) from being tracked in a Git repository.

## Objectives

* Learn how the `.gitignore` mechanism works in Git.
* Configure rules to ignore single files, file patterns, and entire directories.
* Verify working directory status before and after applying ignore patterns.

## Tools Used

* **OS:** Windows
* **Terminal:** Git Bash
* **Editor:** Notepad++
* **Version Control System:** Git

## Steps & Commands Executed

### 1. Created Unwanted Log Files & Directory

echo "This is a log file" > app.log
mkdir log
echo "Inside log directory" > log/debug.log
