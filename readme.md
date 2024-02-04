#Header
[user]
	name = jcoumarb
	email = jcoumarb@unca.edu
[init]
	defaultBranch = main
#Question 1
there is now a .git directory, I tried to cd it to find out and it was also a differnet color
contains: branches  config  description  HEAD  hooks  info  objects  refs
#Question 2
On branch main

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	readme.md

nothing added to commit but untracked files present (use "git add" to track)
#Question 3
jcoumarb@arden:~/exercises$ git commit -m "added readme.md to the repo"
[main (root-commit) 4c725e4] added readme.md to the repo
 1 file changed, 20 insertions(+)
 create mode 100644 readme.md
jcoumarb@arden:~/exercises$ git status
On branch main
nothing to commit, working tree clean
#Question 4
commit 4c725e4b8bb55e7e36d5300d78c5eb900b32224e (HEAD -> main)
Author: jcoumarb <jcoumarb@unca.edu>
Date:   Sun Feb 4 12:46:28 2024 -0500

    added readme.md to the repo
#Solutions
1. Write a function that takes in a list of integers as an argument
and returns true if it contains two integers that are the same, false
otherwise.
#Subcomammands
status - shows the current state of git and your current branch 
add - puts changes in the staging area which is where files wile be commited from
commit - adds changes to the repo
log - shows the history of what has been done to the repo
diff - shows what has happened since the last commit

