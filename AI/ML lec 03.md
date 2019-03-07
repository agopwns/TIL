# lec03
w는 코스트

### What cost(W) looks like?
- w=1, cost(W)=0
- w=0, cost(W)=4.67
- w=2, cost(W)=4.67

w가 최소화 되는 점을 찾는 것이 목적.

### Gradient descent algorithm
경사 내려감 알고리즘!?

- Minimize cost function
- Gradient descent is used many minimization problems
- For a given cost function, cost(W,b), it will find W, b to minimize cost
- It can be applied to more general function: cost(w1, w2, ...)

### How it works?
가장 낮은 점을 어떻게 찾을 것인가?

1. 경사도를 따라 간다
2. 경사가 계속 값에 근접
3. 경사가 값에 도달

- Start with intial guesses
    - Start at 0,0 (or any other value)
    - Keep changing W and b a little bit to try and reduce cost(W,b)
- Each time you change the parameters, you select the gradient which reduces cost(W,b) the most possible
- repeat
- Do so until you converge to a local minimum
- Has an interesting property
    - Where you start can determine which minimum you end up

기울기를 계속해서 미분하여 값을 찾아감.