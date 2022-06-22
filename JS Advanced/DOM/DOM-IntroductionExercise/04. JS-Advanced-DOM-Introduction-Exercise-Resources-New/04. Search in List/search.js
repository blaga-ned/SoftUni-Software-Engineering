function search() {

   let inputWord = document.getElementById('searchText').value;
   let townsElements = Array.from(document.querySelectorAll('#towns li'));
   let matchedResult = document.getElementById('result');
   let count = 0;

   for (let town of townsElements) {
      if (town.textContent.includes(inputWord)) {
         town.style.fontWeight = 'bold';
         town.style.textDecoration = 'underline';
         count++;
      } else {
         town.style.fontWeight = 'normal';
         town.style.texDecoration = 'none';
      }
   }
   matchedResult.textContent = `${count} matches found`
}
