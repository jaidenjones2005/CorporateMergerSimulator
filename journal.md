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

## Phase 2: The Merger Logic

In this phase, I added the merger logic using a
while loop and Java's PriorityQueue.

The program removes the two smallest companies,
combines their sizes, adds a 10% synergy bonus,
and creates a new merged company.

I learned that PriorityQueue is more efficient
than sorting an ArrayList during every merger.
Adding an element to a PriorityQueue takes
O(log n) time, while sorting an entire ArrayList
takes O(n log n) time.

This makes PriorityQueue a better choice when
the program repeatedly needs to find and remove
the smallest companies.

## Phase 3: The Titan Threshold

In this phase, I updated the merger simulation to
stop when a company reaches 500,000 units or when
fewer than two companies remain in the market.

I added a counter to track the total number of
mergers and created a final report that displays
whether an Industry Titan emerged.

I learned that checking the queue size before
calling poll() twice is important because poll()
returns null when the queue is empty.

Without checking the queue size, the program
could try to access a company that doesn't exist,
causing a NullPointerException.

This relates to underflow because the program
would be trying to remove more elements than
the queue contains.

