function deck(cards) {
  const result = [];
  for (let cardAsString of cards) {
    const face = cardAsString.slice(0, -1);
    const suit = cardAsString.slice(-1);

    try {
      const card = createCards(face, suit);
      result.push(createCards(face, suit));
    } catch (err) {}
  }
  console.log(result.join(" "));

  function createCards(face, suit) {
    const faces = ["2", "3", "4", "5", "6", "8", "9", "10", "J", "Q", "K", "A"];
    if (faces.indexOf(face) == -1) {
      throw new Error("Invalid face " + face);
    }
    const suits = {
      S: "\u2660",
      H: "\u2665",
      D: "\u2666",
      C: "\u2663",
    };
    const result = {
      face,
      suit: suits[suit],
      toString() {
        return this.face + this.suit;
      },
    };
    return result;
  }
}

console.log(deck(["AS", "10D", "KH", "2C"]));
console.log(deck(["5S", "3D", "QD", "1C"]));
