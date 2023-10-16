
var char = window.prompt("Enter a character");
char = char.toLowerCase();
switch(char){
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        document.write("Vowel");
        break;
    default:
        document.write("Consonant");
}