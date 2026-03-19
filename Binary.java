class Binary{ 
public String convertToBinary(int num) { 
if (num == 0) return "0"; 
String binary = ""; 
while (num > 0) { 
binary = (num % 2) + binary; 
num /= 2; 
} 
return binary; 
} 
}
