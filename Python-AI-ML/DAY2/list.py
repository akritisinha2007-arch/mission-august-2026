
#list are mutable, ordered and allows duplicate values

#slicing in list
#indexing starts from 0 in list
l=[1,2,3,4,5,6,7,8,9]
print(l[0:5]) #slicing from index 0 to 4
print(l[5:]) #slicing from index 5 to end
print(l[-2])

#List traversing
#1. using index
for i in range(len(l)):
    print(l[i])
#2. directly on values
for i in l:
    print(i)


#difference b/w method and function
# function is a block of code that performs a specific task and can be called from anywhere in the program. 
# A method is a function that is associated with an object and can only be called on that object. 
# In Python, methods are defined within classes and are called on instances of those classes.
#print(a) #function
#a.len()    #method

print(dir(l)) #list of all methods and attributes of list   

#help(l) #explanation of all methods and attributes of list

#append- adds to the end of the list
l.append(34)
l.append(45)
print(l) #[1,2,3,4,5,6,7,8,9,34,45]

l.insert(2, 100) #inserts 100 at index 2
print(l) #[1, 2, 100, 3, 4, 5, 6, 7, 8, 9, 34, 45]

l.extend([200, 300, 400]) #adds multiple values to the end of the list
print(l) #[1, 2, 100, 3, 4, 5, 6, 7, 8, 9, 34, 45, 200, 300, 400]

l.remove(100) #removes first occurrence of 100
print(l) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 34, 45, 200, 300, 400]    

print(l.pop()) #removes and returns last element of the list
print(l) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 34, 45, 200, 300]

print(l.index(34)) #returns index of first occurrence of 34 

print(l.count(34)) #returns number of occurrences of 34

l.sort() #sorts the list in ascending order
print(l) #[1, 2, 3, 4, 5, 6, 7, 8, 9, 34, 45, 200, 300] 

l.reverse() #reverses the list
print(l) #[300, 200, 45, 34, 9, 8, 7, 6, 5, 4, 3, 2, 1]

print(l.copy()) #returns a shallow copy of the list

#print(l.clear()) #removes all elements from the list

#since list is mutable, we can change the values of the list
l[0]=140
print(l) #[140, 200, 45, 34, 9, 8, 7, 6, 5, 4, 3, 2, 1]

#q1: print positive and negative numbers from the list
list=[1,2,3,-4,-5,6,-7,8,9]
positive=[]
negative=[]
for i in list:
    if i>0:
        positive.append(i)
    else:
        negative.append(i)

print(f"Positive numbers: {positive}")
print(f"Negative numbers: {negative}")


#Q2:find average of numbers in the list
total=sum(list)
average=total/len(list)
print(average)
sum=0
for i in list:
    sum+=i
avg=sum/len(list)
print(avg)

#q3: find largest and smallest number in the list
largest=max(list)
smallest=min(list)
print(largest)
print(smallest)

lar=sm=list[0]
for i in range(len(list)):
    if list[i]>lar:
        lar=list[i]
    if list[i]<sm:
        sm=list[i]
print(lar)
print(sm)

#q4:find second largest and second smallest number in the listl
list.sort()
print(list[1])  # second smallest
print(list[-2])  # second largest

las=[12,45,2,34]
large=las[0]
seclar=las[0]
for i in las:
    if i>large:
        seclar=large
        large=i
    elif i>seclar and i <large:
        seclar=i

print(seclar,large) 

#q5:check if list is sorted or not
l1=[1,2,3,4,5]
l1.sort()
if l1==sorted(l1):
    print("List is sorted")


for i in range(len(l1)-1):
    if l1[i] > l1[i+1]:
        print("List is not sorted")
        break
else:
    print("List is sorted")
