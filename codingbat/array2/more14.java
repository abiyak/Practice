//Practice with site codingbat.com
public boolean more14(int[] nums) {
  int cOne = 0;
  int cFour = 0;
  for(int a: nums){
    if(a == 1){
      cOne++;
    }
    if(a == 4){
      cFour++;
    }
  }
  if(cOne > cFour){
    return true;
  }
  else{
    return false;
  }
}