a=(9,12,4,50)
print(type(a))
#tuples
# tuples are immutable, meaning that once they are created, their elements cannot be changed or modified.
# object doesn't support item assignment
# tuples has duplicate elements, meaning that they can contain multiple occurrences of the same value.
# tuples are ordered and can be assessed through index value
print(a[2])

# tuples have heterogeneous data types, meaning that they can contain elements of different data types, such as integers, strings, and floats.
# tuples are traversed similiar as lists
for i in a:
    print(i)
for i in range(len(a)):
    print(a[i])

#methods in tuples

print(a.index(12)) #returns index value of 12

print(a.count(4)) #count occurences of 4

#tuple unpacking 
a,b,c,d=(1,2,3,4)
print(a)
print(b)
print(c)
print(d)

print(type(a)) #integer 
#if u don't want to unpack it
p=(1,)
print(type(p))#tuple
