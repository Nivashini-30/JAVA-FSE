# Task 4: Merge Conflict Resolution in Git

This lab exercise demonstrates how to handle and resolve merge conflicts when changes are made concurrently to the same file in both the main branch and a feature branch.

## Lab Objectives

* Verify working branch state.
* Create a feature branch (`GitWork`) and modify `hello.xml`[cite: 3].
* Make conflicting modifications to `hello.xml` in the `main` branch[cite: 3].
* Trigger a merge conflict using `git merge`[cite: 3].
* Resolve conflicts using conflict resolution tools/editors[cite: 3].
* Add backup `.orig` file patterns to `.gitignore`[cite: 3].
* Clean up merged feature branches and verify log graph[cite: 3].

## Tools Used

* **OS:** Windows[cite: 3]
* **Terminal:** Git Bash[cite: 3]
* **Text Editor:** Notepad++[cite: 3]
* **Version Control:** Git[cite: 3]

## Execution & Command Log

# 1. Verify main state and create branch GitWork
git checkout main
git status
git branch GitWork
git checkout GitWork

# 2. Add hello.xml in GitWork branch and commit
echo "<note><to>Nivi</to><message>Hello from Branch</message></note>" > hello.xml
git add hello.xml
git commit -m "Add hello.xml on GitWork branch"

# 3. Switch to main and add conflicting content to hello.xml
git checkout main
echo "<note><to>Nivi</to><message>Hello from Main Branch</message></note>" > hello.xml
git add hello.xml
git commit -m "Add conflicting hello.xml on main branch"

# 4. Attempt merge to produce conflict
git merge GitWork

# 5. Resolve conflict in hello.xml and commit
git add hello.xml
git commit -m "Resolved merge conflict in hello.xml"

# 6. Ignore backup files and cleanup branch
echo "*.orig" >> .gitignore
git add .gitignore
git commit -m "Add .orig to .gitignore"
git branch -d GitWork
git status
