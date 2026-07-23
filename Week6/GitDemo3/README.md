# Task 3: Branching and Merging in Git

This lab exercise demonstrates how to create a feature branch, make modifications, view branch differences, merge changes back into the main branch, and safely clean up the branch.

## Lab Objectives

* Construct a new working branch (`GitNewBranch`)[cite: 2].
* Inspect local and remote branches using Git Bash[cite: 2].
* Make commits within an isolated feature branch[cite: 2].
* View command-line and visual differences between branches[cite: 2].
* Merge the feature branch back into the main branch (`main`/`master`)[cite: 2].
* Delete the merged branch and verify repository clean status[cite: 2].

## Tools Used

* **OS:** Windows[cite: 2]
* **Terminal:** Git Bash[cite: 2]
* **Diff Tool:** P4Merge / Git Diff[cite: 2]
* **Version Control:** Git[cite: 2]

## Execution & Command Log

# 1. Create and switch to new branch
git branch GitNewBranch
git branch -a
git checkout GitNewBranch

# 2. Add changes and commit in feature branch
echo "Testing branching in Git" > feature.txt
git add feature.txt
git commit -m "Add feature.txt in GitNewBranch"
git status

# 3. Switch back to main and compare differences
git checkout main
git diff main..GitNewBranch
git difftool -t p4merge main..GitNewBranch

# 4. Merge branch into main
git merge GitNewBranch

# 5. Check log history and delete feature branch
git log --oneline --graph --decorate
git branch -d GitNewBranch
git status
