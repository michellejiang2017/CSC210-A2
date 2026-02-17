# A2 Linked Lists

## Basic Information

Your name: Michelle Jiang

Other students you worked with, including TAs: asked JingYuan about tests 

If anyone was particularly helpful, please give them a shout-out here: 


## References

Any references or resources used besides JavaDoc and course materials:
https://www.geeksforgeeks.org/dsa/singly-linked-list-tutorial/

Only really used it to understand the theory behind how to do what I wanted. 

If you used generative AI, how did you use it? What role did it play in your learning?


## Questions to Answer

What did you observe when comparing the benchmark results for index-based operations vs. node-based operations? Why do those results make sense for a linked list?

The linked list, as we've discussed in class is much faster in terms of adding and removing elements. This makes a lot of sense because for a linked list, the only thing you are really changing is where the pointers point, while in an index-based list, you have to shift all the other elements over. 

Linked List Benchmark: Node-Based vs Index-Based
Each timing is an average over 200 add+remove pairs.

n = 1000
  node addAfter/removeAfter: 604 ns/op
  index add/remove: 35,866 ns/op

n = 5000
  node addAfter/removeAfter: 607 ns/op
  index add/remove: 24,576 ns/op

n = 20000
  node addAfter/removeAfter: 248 ns/op
  index add/remove: 45,184 ns/op


## Reflection 

Please provide a brief reflection about your experience with this assignment. What was easiest? What was hardest? How did your understanding of linked lists evolve?

I forgot to check for edge cases which was a pain in the butt to implement later. I also found the tests really confusing for some reason this time I think I just lacked sleep. Additionally, I think there was an error in the addAfter test case, which I was genuinely so confused about but in the end I just edited the test so it didn't have that mistake anymore. I found like the beginning part of implementing the ideas of the linked list to be relatively easy (minus the edge cases). 

This made me think about how linked lists are structured and created and was a big help in terms of applying what we learned in class. 