s={2,5,4,32,2,4}
print(s) #{32,2,4,5}
# set is a collection of well defined objects
#no repeated values , heterogeneous
#sets are unordered collection of data items.
#sets are unchangeable (immutable) i.e u can't change items of the set once created
#items of sets cannot be accessed through index value since order of items is not maintained in sets

ak={}
print(type(ak)) #dict

akk=set()
print(type(akk)) #set

for i in s:
    print(i)
