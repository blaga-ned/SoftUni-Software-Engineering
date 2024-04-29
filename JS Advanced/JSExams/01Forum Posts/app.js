window.addEventListener("load", solve);

function solve() {
  const title = document.getElementById('post-title');
  const category = document.getElementById('post-category');
  const content = document.getElementById('post-content');
  const publishBtn = document.getElementById('publish-btn');
  const clearBtn = document.getElementById('clear-btn');

  publishBtn.addEventListener('click', publish);

  function publish(ev) {
    ev.preventDefault();

    if (title.value == '' || category.value == '' || content.value == '') {
      return;
    }
    const reviewListToAppend = document.getElementById('review-list');
    const publishedListToAppend = document.getElementById('published-list');

    const li = document.createElement('li');
    li.className = 'rpost';
    const article = document.createElement('article');
    const h4 = document.createElement('h4');
    h4.textContent = title.value;
    const p1 = document.createElement('p');
    let categoryText = category.value;
    p1.textContent = `Category: ${categoryText}`;
    const p2 = document.createElement('p');
    let contentText = content.value;
    p2.textContent = `Content: ${contentText}`;
    const editBtn = document.createElement('button');
    editBtn.textContent = 'Edit';
    editBtn.className = 'action-btn edit';
    const approveBtn = document.createElement('button');
    approveBtn.textContent = 'Approve';
    approveBtn.className = 'action-btn approve';

    article.appendChild(h4);
    article.appendChild(p1);
    article.appendChild(p2);

    li.appendChild(article);
    li.appendChild(editBtn);
    li.appendChild(approveBtn);

    reviewListToAppend.appendChild(li);
    clearInputs();

    editBtn.addEventListener('click', () => {
      resetText(h4.textContent, categoryText, contentText);
      li.remove();
    });

    approveBtn.addEventListener('click', () => {
      editBtn.remove();
      approveBtn.remove();
      publishedListToAppend.appendChild(li);
    });

    clearBtn.addEventListener('click', () => {
      publishedListToAppend.innerHTML = '';
    });
  }

  function clearInputs() {
    title.value = '';
    category.value = '';
    content.value = '';
  }

  function resetText(titleText, categoryTex, contentText) {
    title.value = titleText;
    category.value = categoryTex;
    content.value = contentText;
  }
}
