var grade = window.prompt("Enter your grade");

if(grade == 100)
{
    document.write("A+");
}else if(grade >= 90)
{
    document.write("A");
}else if(grade >= 80)
{
    document.write("B");
}else if(grade >= 70)
{
    document.write("C");
}else if(grade >= 60)
{
    document.write("D");
}else {
  document.write("Fail");
}
