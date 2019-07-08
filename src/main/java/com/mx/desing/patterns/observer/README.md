# Java Design Patterns - Observer


Demo1.

Our observer here wants to be notified when the flag value changes in the subject. With the
output, you will discover that the observer is getting the notifications when the flag value changed to 5 or But there is no notification when the flag value changed to 50 because by this time the observer has
unregistered himself from the subject.

Demo2.

Let us consider a relatively complex problem. Let us assume the following:
1. Now we need to have a multiple observer class.
2. And we also want to know about the exact change in the subject. If you notice our earlier implementation, you can easily understand that there we are getting some kind of notification but our observer does not know about the changed value in the subject

Assignment
Implement an observer pattern where you have multiple observers and multiple subjects.