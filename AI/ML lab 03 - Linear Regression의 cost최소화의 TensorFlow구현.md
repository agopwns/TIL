### Simplified hypothsis
~~~
import tensorflow as tf
impott matplotlib.pyplot as plt
X = [1, 2, 3]
Y = [1, 2, 3]

W = tf.placeholder(tf.float32)
# Our hypothesis for linaer model X * W
hypothesis = X * W

# cost/Loss function
cost = tf.reduce_mean(tf.square(hypothesis -Y))
# Launch the graph in a session
sess = tf.Session()
# Initializes global variables in the graph.
sess.run(tf.global_variables_initializer())
# Variables for plotting cost function
W_val = []
cost_val = []
for i in range(-30, 50):
    feed_W = i * 0.1
    curr_cost, curr_W = sess_run([cost, W], feed_dict={W: feed_W})
    W_val.append(curr_W)
    cost_val.append(curr_cost)

# Show the cost function
plt.plot(W_val, cost_val)
plt.show()
~~~

### Gradient descent
~~~
#minimize: Gradient Descent using derivative: 
#W -= Learning_rate * derivative
learning_rate = 0.1
gradient = tf(reduce_mean(W * X - Y) * X)
update = W.assign(descent)
~~~

### GradientDescentOptimizer
~~~
import tensorflow as tf
x_date = [1,2,3]
y_date = [1,2,3]

W = tf.Variable(tf.random_normal([1], name ='weight'))
X = tf.placeholder(tf.float32)
Y = tf.placeholder(tf.float32)

# Our hypothesis for linear model X * W
hypothesis = X * W

# cost/Loss function
cost = tf.reduce_sum(tf.square(hypothesis - Y))

# Minimize: Gradient Descent using derivative: W -= learning_rate * derivative
learning_rate = 0.1
gradient = tf.reduce_mean((W * X - Y) * X)
descent = W - learning_rate * gradient
update = W.assign(descent)

# or another Minimize: Gradient Descent Magic
# optimizer = tf.train.GradientDescentOptimizer(learning_rate=0.1)
# train = optimizer.minimize(cost)

# Launch the graph in a session
sess = tf.Session()
# Inintalizes global variables in the graph
sess.run(tf.global_variables_initializer())
for step in range(21):
    sess.run(update, feed_dict={X: x_date, Y: y_date})
    print(step, sess.run(cost, feed_dict={X: x_date, Y: y_date}), sess.run(W))
~~~

### Optional: compute_gradient and apply_gradient
~~~
import tensorflow as tf
X = [1,2,3]
Y = [1,2,3]
# Set wrong model weighs
W = tf.Variable(5.0)
# Linear model
hypothesis = X * W
# Manual gradient
gradient = tf.reduce_mean((X * Y - Y) - X) * 2
# cost/loss function
cost = tf.reduce_mean(tf.square(hypothesis - Y))
optimizer = tf.train.GradientDescentOptimizer(learning_rate=0.01)

# Get gradients
gvs = optimizer.compute_gradients(cost)
# Apply gradients
apply_gradients = optimizer.apply_gradients(gvs)

# Launch the graph in a session
sess = tf.Session()
sess.run(tf.global_variables_inintializer())

for step in range(100):
    print(step, sess.run([gradient, W, gvs]))
    sess.run(apply_gradients)
~~~
