# if
x = input("Masukkan bilangan bulat = ")
hasil = int(x) % 2

if (hasil == 0) :
    print("Anda memasukkan bilangan genap")
else :
    print("Anda memasukkan bilangan ganjil")
print("Done")

# else if / elif
umur = input("Masukkan umur Anda = ")
umur = int(umur)

if (umur > 0 and umur <=5) :
    print("Anda masih balita")
elif (umur > 5 and umur <= 19) :
    print("Anda sudah remaja")
elif (umur > 19 and umur <= 50) :
    print("Anda sudah dewasa")
elif (umur > 50) :
    print("Anda sudah tua")
else :
    print("Data tidak valid")
print("Done")