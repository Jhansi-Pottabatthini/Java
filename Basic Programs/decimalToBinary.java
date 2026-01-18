public static int decimalToBinary(int number) {
int result = 0;
while(number > 0){


    int mod = number % 2;
    result = result * 1 + mod;

    number /= 2;
}

return result;
}
