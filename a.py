class Employee:
    def __init__(self, emp_id, name, age, salary):
        self.emp_id = emp_id
        self.name = name
        self.age = age
        self.salary = salary

class EmployeeTable:
    def __init__(self, employees):
        self.employees = employees

    def display_table(self):
        print("Employee ID   Name    Age   Salary")
        for emp in self.employees:
            print(f"{emp.emp_id}   {emp.name}   {emp.age}   {emp.salary}")

    def sort_table(self, sorting_parameter):
        if sorting_parameter == 1:
            self.employees.sort(key=lambda x: x.age)
        elif sorting_parameter == 2:
            self.employees.sort(key=lambda x: x.name)
        elif sorting_parameter == 3:
            self.employees.sort(key=lambda x: x.salary)
        else:
            print("Invalid sorting parameter. Please choose 1, 2, or 3.")

# Sample data
employees_data = [
    Employee("161E90", "Ramu", 35, 59000),
    Employee("171E22", "Tejas", 30, 82100),
    Employee("171G55", "Abhi", 25, 100000),
    Employee("152K46", "Jaya", 32, 85000)
]

# Creating EmployeeTable object
employee_table = EmployeeTable(employees_data)

# Displaying original table
print("Original Employee Table:")
employee_table.display_table()

# User input for sorting parameter
sorting_param = int(input("\nEnter sorting parameter (1. Age, 2. Name, 3. Salary): "))

# Sorting and displaying the table
employee_table.sort_table(sorting_param)
print("\nSorted Employee Table:")
employee_table.display_table()
