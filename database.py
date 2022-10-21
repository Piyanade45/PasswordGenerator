import pymysql
import re

con = pymysql.connect(host='localhost',
                            database='python_8_10',
                            user='root',
                            password='')
cur = con.cursor()

    
def add_employ():
    
    id = int(input('Enter Employee login id: '))
    if id == True:
        print('Employee id is already exist/Try again')
        again = input('Press any Key to continue Again: ')
        add_employ()
        
    name = input('Enter Employee Name: ')
    if name == True:
        print('Employee Name is already exist/Try again')
        again = input('Press any Key to continue Again: ')
        add_employ()
    
    Email = input('Enter Employee Email ID: ')
    regex = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b'
    if (re.fullmatch(regex, Email)):
        print('Valid Email ')
    else:
        print('Invalid Email')
        again = input('Press any Key to continue Again: ')
        add_employ()
    
    Phone = input('Enter Phone Number: ')
    pattern = re.compile("[7-9]{1}[0-9]{9}")
    if re.match(pattern, Phone):
        print('Valid Mobile Number')
    else:
        print('Invalid Mobile Number')
        again = input('Press any Key to continue Again: ')
        add_employ()
        
    Adress = input('Enter Employee Adress: ')
    Employ_Post = input('Enter Employee Post: ')
    
    
    data = (id,name,Email,Phone,Adress,Employ_Post)
    sql = 'insert into EmployData values (%s,%s,%s,%s,%s,%s)'
    c = con.cursor()
    c.execute(sql,data)
    con.commit()
    print("Successfully Added Employee Record")
    a = input("Press Any Key To Continue..")
    menu()
    
def Show_employ():
    sql = 'select * from EmployData'  
    cur = con.cursor()
    cur.execute(sql)
    a = cur.fetchall()
    for i in a :
        print("Employee Id: ", i[0])
        print("Employee Name: ", i[1])
        print("Employee Email Id: ", i[2])
        print("Employee Phone No.: ", i[3])
        print("Employee Address: ", i[4])
        print("Employee Post: ", i[5])
        print("\n")
    press = input("Press Any key To Continue..")
    menu()

def update_employ():
    id = input('Enter Employee ID : ')
    if id==False:
        print('Employee id doesnot Exist/Try again')
        again = input('Pree any Key to continue again')
        menu()
    else:
        Email = input('Enter Employee Email ID :')
        regex = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b'
        if (re.fullmatch(regex, Email)):
            print('Valid Email ')
        else:
            print('Invalid Email')
            again = input('Press any Key to continue Again: ')
            update_employ()
    
        Phone = input('Enter Phone Number: ')
        pattern = re.compile("[7-9]{1}[0-9]{9}")
        if (re.match(pattern,Phone)):
            print('Valid Mobile Number')
        else:
            print('Invalid Mobile Number')
            again = input('Press any Key to continue Again: ')
            update_employ()
       
    sql = 'update EmployData set Email = %s, Phone= %s where id= %s'
    data = (Email,Phone,id)  
    c = con.cursor()
    c.execute(sql,data)
    con.commit()
    
    print("Updated Employee Record")
    press = input("Press Any Key To Continue..")
    menu()
              
def remove_employ():
    id = input('Enter Employee ID : ')
    if id==False:
        print('Employee id doesnot Exist/Try again')
        again = input('Pree any Key continue to Remove Employee Record: ')
        menu()
    else:
        data= (id) 
        sql = 'delete from EmployData where id = %s' 
        data= (id,) 
        c = con.cursor()
        c.execute(sql,data)
        con.commit()
        print("Employee Removed")
        press = input("Press Any key To Continue..")
        menu()
 
def search_employ():
    id = input('Enter Employee ID : ')
    if id==False:
        print('Employee id doesnot Exist/Try again')
        again = input('Pree any Key to continue: ')
        menu()
    else: 
        sql = 'select * from EmployData where id = %s'
        data = (id,)
        cur = con.cursor()
        cur.execute(sql,data)
        r = cur.fetchall()
        
        for i in r :
            print("Employee Id: ", i[0])
            print("Employee Name: ", i[1])
            print("Employee Email Id: ", i[2])
            print("Employee Phone No.: ", i[3])
            print("Employee Address: ", i[4])
            print("Employee Post: ", i[5])
            print("\n")
        press = input("Press Any key To Continue..")
        menu()

def menu():
    while True: 
        print("1. Add Employee")
        print("2. Display All Employee Records")
        print("3. Search Single Employee Record")
        print("4. Update Employee Record")
        print("5. Remove Employee Record")
        print("6. Exit\n")
    
        choice = int(input('Enter Your Choice: '))
    
        if choice== 1:
            add_employ()
        elif choice==2:
            Show_employ()
        elif choice==3:
            search_employ()
        elif choice==4:
            update_employ()
        elif choice ==5:
            remove_employ()
        elif choice ==6:
            print('Bye! Have a nice day ')
        else:
            print("Invalid Choice!")
            press = input("Press Any key To Continue..")
            menu()
menu()
    
    
    

