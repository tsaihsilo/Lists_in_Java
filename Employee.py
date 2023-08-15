from Person import Person

class Employee(Person):
    def __init__(self, newName="none", address="none", phone="999-999-9999", department="not assigned"):
        super().__init__(newName, address, phone)
        self.department = department

    def setDepartment(self, department):
        self.department = department

    def getDepartment(self):
        return str(self.department)
    
    def __str__(self):
        breaking = '==================='
        string = f'Name: {self.getName()}\nAddress: {self.getAddress()}\nPhone: {self.getPhone()}\nDepartment: {self.getDepartment()}\n{breaking}'
        return string