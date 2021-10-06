umur = input("Masukkan umur Anda = ")
umur = int(umur)

if (umur > 0 and umur <=5) :
    print("Anda masih balita")
    print()
    umurOrangTua = input("Masukkan umur Orang Tua Anda= ")
    umurOrangTua = int(umurOrangTua)
    if (umurOrangTua < 15) :
        print("Sebaiknya meminta bantuan pengasuh anak dan orang tua")
    elif (umurOrangTua >= 15 and umurOrangTua < 19) :
        print("Sebaiknya meminta bantuan orang tua")
    else :
        print("Anda bisa mengasuhnya sendiri")
elif (umur > 5 and umur <= 19) :
    print("Anda sudah remaja")
elif (umur > 19 and umur <= 50) :
    print("Anda sudah dewasa")
elif (umur > 50) :
    print("Anda sudah tua")
else :
    print("Data tidak valid")
print()
print("Done")