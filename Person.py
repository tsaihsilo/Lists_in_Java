class Person:
    def __init__(self, newName="none", address="none", phone="999-999-9999"):
        self.name = newName
        self.address = address
        self.phone = phone

    def setName(self, name):
        self.name = name
    
    def getName(self):
        return str(self.name)

    def setAddress(self, address):
        self.address = address

    def getAddress(self):
        return str(self.address)

    def setPhone(self, phone):
        self.phone = phone

    def getPhone(self):
        return str(self.phone)

    def __str__(self):
        breaking = '==================='
        string = f'Name: {self.getName()}\nAddress: {self.getAddress()}\nPhone: {self.getPhone()}\n{breaking}'
        return string