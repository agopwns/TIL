### Loading data from file

import numpy as np



xy = np.loadtxt('data.csv', delimiter=',', dtype=np.float32)

x_data = xy[:, 0: -1]

y_data = xy[:, [-1]]



print(x_data.shape, x_data, len(x_data))

print(y_data.shape, y_data)



### Queue Runners

filename_queue = tf.train.string_input_producer(

            ['data1.csv','data2.csv',...],

            shuffle = False, name = 'filename_queue')



reader = tf.TextLineReader()

key, value = reader.read(filename_queue)



record_defaults = [[0.], [0.], [0.], [0.]]

xy = tf.decode_csv(value, record_defaults=record_defaults)



# collect batches of csv in

train_x_batch, train_y_batch = \

      tf.train_batch(xy[0:-1], xy[-1:]], batch_size=10)



sess = tf.Session()

...



# Start populating the filename queue

coord = tf.train_Coordinator()

threads = tf.train.start_queue_runners(sess=sess, coord=coord)



for step in range(2001):

      x_batch, y_batch = sess.run([train_x_batch, train_y_batch])

      ...

coord.request_stop()

coord.join(threads)