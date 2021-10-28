bilangan = [0, 1, 2, 3, 4]
for item in bilangan:
    x = input("Masukan bilangan ke-"+ str(item) +" = ")
    x = int(x)
    if (x == 0):
        break
    else :
        bilangan[item] = x
for item in range(bilangan[item]):
    if (bilangan[item] == 0):
        break
    else :
        print("Bilangan ke-"+ str(item) +" = " + str(bilangan[item]))