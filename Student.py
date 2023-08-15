from Person import Person

class Student(Person):
    def __init__(self, newName="none", address="none", phone="999-999-9999", year=9999):
        super().__init__(newName, address, phone)
        self.year = year

    def setGraduationYear(self, year):
        self.year = year

    def getGraduationYear(self):
        return int(self.year)

    def __str__(self):
        breaking = '==================='
        string = f'Name: {self.getName()}\nAddress: {self.getAddress()}\nPhone: {self.getPhone()}\nExpected Graduation Year: {self.getGraduationYear()}\n{breaking}'
        return string