function isPalindrome(string) {
    var reverse = "";
    for (let i = string.length-1; i >= 0; i--) {
          reverse += string[i];
      }
  return reverse === string;
  }
  
  // Do not edit the line below.
  const _isPalindrome = isPalindrome;
export { _isPalindrome as isPalindrome };
  