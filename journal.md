# Corporate Merger Simulator Journal

## Phase 1: The Company Model & The Market

In this phase, I created a Company class that stores
each company's name and size. I also implemented
Comparable so the PriorityQueue could organize
companies based on their sizes.

I learned that PriorityQueue uses the compareTo()
method to determine which company is the smallest.
The company with the smallest size is removed first
when poll() is called.

If I wanted to merge the largest companies first,
I could reverse the comparison in compareTo().
This would make the queue prioritize larger
companies instead of smaller ones.

