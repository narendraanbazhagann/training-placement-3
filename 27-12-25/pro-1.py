import threading
import time

class MyThread(threading.Thread):
    def run(self):
        for i in range(1, 6):
            print("Thread running:", i)
            time.sleep(0.5)

t1 = MyThread()
t2 = MyThread()

t1.start()
t2.start()
