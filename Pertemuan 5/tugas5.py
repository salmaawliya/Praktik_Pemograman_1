nama = input("Masukkan Nama Lengkap Anda: ")
nim = input("Masukkan NIM Anda: ")
prodi = input("Masukkan Prodi Anda: ")
ipk = input("Masukkan IPK Anda: ")
lamaStudi = input("Masukkan Lama Studi Anda (tahun): ")

print()
if ((float (ipk) >= 3.51 and float(ipk) <=4.00) and float(lamaStudi) <= 4) :
    print(nama)
    print(nim)
    print(prodi)
    print("Predikat Kelulusan Anda adalah \"Summa Cumlaude (Dengan Pujian Tertinggi)\"")
elif ((float (ipk) >= 3.51 and float(ipk) <=4.00) and float(lamaStudi) > 4) :
    print(nama)
    print(nim)
    print(prodi)
    print("Predikat Kelulusan Anda adalah \"Cumlaude (Dengan Pujian)\"")
elif ((float(ipk) >= 3.01 and float(ipk) <3.51) and float(lamaStudi) > 0) :
    print(nama)
    print(nim)
    print(prodi)
    print("Predikat Kelulusan Anda adalah \"Sangat Memuaskan\"")
elif ((float(ipk) >= 2.76 and float(ipk) < 3.01) and float(lamaStudi) > 0) :
    print(nama)
    print(nim)
    print(prodi)
    print("Predikat Kelulusan Anda adalah \"Memuaskan\"")
elif ((float(ipk) >= 2.00 and float(ipk) < 2.76) and float(lamaStudi) > 0) :
    print(nama)
    print(nim)
    print(prodi)
    print("Predikat Kelulusan Anda adalah \"Cukup\"")
elif (float(ipk) < 2.00 and lamaStudi > 0) :
    print(nama)
    print(nim)
    print(prodi)
    print("Predikat Kelulusan Anda adalah \"Tidak Lulus\"")
else :
    print("\"Data Tidak Valid\"")