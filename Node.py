from Person import *
from Student import *
from Employee import *

class Node:
    def __init__(self, value = None, previous = None, next = None):
        self.value = value
        self.previous = previous
        self.next = next

    def setValue(self, value):
        self.value = value

    def getValue(self):
        return self.value
    
    def getName(self):
        return self.value.getName()

    def setPrevious(self, previous):
        self.previous = previous

    def getPrevious(self):
        return self.previous

    def setNext(self, next):
        self.next = next

    def getNext(self):
        return self.next