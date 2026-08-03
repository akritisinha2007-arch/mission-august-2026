#print("Hello") #print is an inbuilt function
#def keyword is used for user defined function

def hello():
    print("Hello!");
hello()
#PARAMETERS AND ARGUMENTS 
# Parameters are the variables that are defined in the function definition.
# Arguments are the values that are passed to the function when it is called.
def sum(a,b):#here it is parameter
    print(f"sum of numbers is {a + b}")
sum(12,12) #function call
sum(45,68688)#here is it argument
#The thing u accept is parameter and the thing u provide to parameter is argument

# sum(12)
#TypeError: sum() missing 1 required positional argument: 'b'


#TYPES OF ARGUMENTS
#1. Positional arguments
# 2. Keyword arguments
def pro(name,age):
    print(f"Name is {name} and age is {age}")
pro("John", 25) #positional arguments
pro(age=25, name="John") #keyword arguments
pro("John", age=25) #positional and keyword arguments

# 3. Default arguments
def default_pro(name, age=0):
    print(f"Name is {name} and age is {age}")
default_pro("John") #age will take default value 0


def product(a,b=45): #default parameter
    print(f"Product of numbers is {a * b}")
product(12,34) #12*34 #default parameter is overridden 

#RETURN STATEMENT
def s(a,b):
    return a + b
result = s(12,34)
print(f"Sum of numbers is {result}")
