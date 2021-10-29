A = input("Masukkan nilai A = ")
A = float(A)
B = input("Masukkan nilai B = ")
B = float(B)

def penjumlahan(A, B):
    hasil1 = A + B
    return str(hasil1)

def pengurangan(A, B):
    hasil2 = A - B
    return str(hasil2)

def perkalian(A, B):
    hasil3 = A * B
    return str(hasil3)

print("Nilai A + B = " + penjumlahan(A, B)) 
print("Nilai A - B = " + pengurangan(A, B))
print("Nilai A * B = " + perkalian(A, B))