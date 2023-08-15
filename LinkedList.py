from Person import *
from Student import *
from Employee import *
from Node import *

class LinkedList:
    def __init__(self, head = None, tail = None, size = 0):
        self.head = head
        self.tail = tail
        self.size = size
    
    def length(self):
        return self.size
        
    def add(self, e):
        n = Node()
        n.setValue(e)
        if self.size == 0:
            self.head = n
            self.tail = n
        else:
            current_last = self.tail
            n.setPrevious(current_last)
            current_last.setNext(n)
            self.tail = n
        self.size += 1

    def search(self, item):
        current_node = self.head
        prev_node = None
        ll = LinkedList()
        while True:
            if current_node == self.tail:
                if current_node.getValue().name == item:
                    ll.add(current_node)
                break
            else:
                if current_node.getValue().name == item:
                    ll.add(current_node)
                prev_node = current_node
                current_node = current_node.getNext()
        return ll
         

    def delete(self, i):
        current_node = self.head
        prev_node = None
        if i == 0:
            current_node = current_node.getNext()
            self.head = current_node
            current_node.setPrevious(None)
        else:
            counter = 0
            while counter < i:
                prev_node = current_node
                if current_node.getNext() != None:
                    current_node = current_node.getNext()
                else:
                    return 'Invalid'
                counter += 1
            if current_node == self.tail:
                prev_node.setNext(None)
                self.tail = prev_node
            else:
                prev_node.setNext(current_node.getNext())
                current_node.getNext().setPrevious(prev_node)

    def insert(self, index, object):
        n = Node()
        n.setValue(object)
        current_node = self.head
        if index == 0:
            self.head = n
            n.setNext(current_node)
            n.setPrevious(None)
        else:
            counter = 0
            while counter < index - 1 :
                current_node = current_node.getNext()
                counter += 1
            n.setNext(current_node.getNext())
            current_node.setNext(n)
            self.size += 1
            
    def __getitem__(self, i):
        currentElement = self.head
        howManyIHaveSkippedOver = 0
        while (howManyIHaveSkippedOver < i):
            currentElement= currentElement.getNext()
            howManyIHaveSkippedOver += 1
        return(currentElement.getValue())


if __name__ == '__main__':
    persons = LinkedList()
    persons.add(Person("jaime", "amherst","111-111-1111"))
    persons.add(Person("maria", "stow","222-222-2222")) 
    persons.add(Person("maria", "nyc","333-333-3333")) 
    persons.add(Person("maria", "malden","444-444-4444")) 
    persons.add(Student("Jaime", "malden","999-999-9999",2025)) 
    persons.add(Employee("Jaime", "Rio Piedras","807-343-9999", "IT"))
    persons.insert(5, Person("Cole", "amherst","666-666-6666"))
    print(persons.delete(1))
    print(persons.__getitem__(0))
    print(persons.__getitem__(1))
    print(persons.__getitem__(2))
    print(persons.__getitem__(3))
    print(persons.__getitem__(4))
    print(persons.__getitem__(5))
    
    print("@@@@@@@@@@@@@@@@@@")

    current = persons.search('Jaime').head
    while current != None:
        print(current.getName())
        current = current.next
    