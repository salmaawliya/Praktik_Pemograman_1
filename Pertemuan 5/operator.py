a = input("Masukkan nilai A = ")
b = input("Masukkan nilai B = ")

# Comparison Operators 
print("A == B = " + str(a == b))             
print("A != B = " + str(a != b))            
print("A > B = " + str(a > b))
print("A < B = " + str(a < b))
print("A >= B = " + str(a >= b))
print("A <= B = " + str(a <= b))

# Logical Operators
print("A < 6 and B > 2 = " + str(int(a) < 6 and int(b) > 2))
print("A < 4 or B > 3 = " + str(int(a) < 4 or int(b) > 3))
print(" not(A < 7) and not(B > 5) = " + str(not(int(a) < 7) and not(int(b) > 5)))