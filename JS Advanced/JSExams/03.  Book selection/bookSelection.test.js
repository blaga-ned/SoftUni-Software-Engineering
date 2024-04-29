const expect = require("chai").expect;

describe("bookSelection tests", function () {
  describe("isGenreSuitable", function () {
    it("with Thriller or Horror genre and age under 12, should return correct value", function () {
      //Arrange
      let genre1 = "Thriller";
      let genre2 = "Horror";
      let age1 = 12;
      let age2 = 13;
      //Act
      let result1 = bookSelection.isGenreSuitable(genre1, age1);
      let result2 = bookSelection.isGenreSuitable(genre2, age1);
      let result3 = bookSelection.isGenreSuitable(genre1, age2);
      let result4 = bookSelection.isGenreSuitable(genre2, age2);

      //Assert
      expect(result1).to.equal("Books with Thriller genre are not suitable for kids at 12 age");
      expect(result2).to.equal("Books with Horror genre are not suitable for kids at 12 age");
      expect(result3).to.equal("Those books are suitable");
      expect(result4).to.equal("Those books are suitable");
    });
  });
});

const bookSelection = {
  isGenreSuitable(genre, age) {
    if (age <= 12 && (genre === "Thriller" || genre === "Horror")) {
      return `Books with ${genre} genre are not suitable for kids at ${age} age`;
    } else {
      return `Those books are suitable`;
    }
  },
  isItAffordable(price, budget) {
    if (typeof price !== "number" || typeof budget !== "number") {
      throw new Error("Invalid input");
    }

    let result = budget - price;

    if (result < 0) {
      return "You don't have enough money";
    } else {
      return `Book bought. You have ${result}$ left`;
    }
  },
  suitableTitles(array, wantedGenre) {
    let resultArr = [];

    if (!Array.isArray(array) || typeof wantedGenre !== "string") {
      throw new Error("Invalid input");
    }
    array.map((obj) => {
      if (obj.genre === wantedGenre) {
        resultArr.push(obj.title);
      }
    });
    return resultArr;
  },
};


const expect = require('chai').expect;
const bookSelection = require('./bookSelection');

describe("bookSelection tests", function () {
  describe("isGenreSuitable", function () {
    it("should return the correct message based on genre and age", function () {
      // Arrange
      const genre1 = "Thriller";
      const genre2 = "Horror";
      const age1 = 12;
      const age2 = 13;
      
      // Act
      const result1 = bookSelection.isGenreSuitable(genre1, age1);
      const result2 = bookSelection.isGenreSuitable(genre2, age1);
      const result3 = bookSelection.isGenreSuitable(genre1, age2);
      const result4 = bookSelection.isGenreSuitable(genre2, age2);
      
      // Assert
      expect(result1).to.equal(`Books with ${genre1} genre are not suitable for kids at ${age1} age`);
      expect(result2).to.equal(`Books with ${genre2} genre are not suitable for kids at ${age1} age`);
      expect(result3).to.equal("Those books are suitable");
      expect(result4).to.equal("Those books are suitable");
    });
  });

  describe("isItAffordable", function () {
    it("should return the correct message based on price and budget", function () {
      // Arrange
      const price1 = 20;
      const budget1 = 30;
      const price2 = 50;
      const budget2 = 30;
      
      // Act
      const result1 = bookSelection.isItAffordable(price1, budget1);
      const result2 = bookSelection.isItAffordable(price2, budget2);
      
      // Assert
      expect(result1).to.equal(`Book bought. You have ${budget1 - price1}$ left`);
      expect(result2).to.equal("You don't have enough money");
    });

    it("should throw an error for invalid input", function () {
      // Arrange
      const invalidPrice = "50";
      const invalidBudget = "30";
      
      // Act and Assert
      expect(() => bookSelection.isItAffordable(invalidPrice, 30)).to.throw("Invalid input");
      expect(() => bookSelection.isItAffordable(50, invalidBudget)).to.throw("Invalid input");
    });
  });

  describe("suitableTitles", function () {
    it("should return an array of book titles with the wantedGenre", function () {
      // Arrange
      const books = [
        { title: "The Da Vinci Code", genre: "Thriller" },
        { title: "Frankenstein", genre: "Horror" },
        { title: "Pride and Prejudice", genre: "Romance" },
        { title: "To Kill a Mockingbird", genre: "Thriller" }
      ];
      const wantedGenre = "Thriller";
      
      // Act
      const result = bookSelection.suitableTitles(books, wantedGenre);
      
      // Assert
      expect(result).to.deep.equal(["The Da Vinci Code", "To Kill a Mockingbird"]);
    });

    it("should throw an error for invalid input", function () {
      // Arrange
      const invalidBooks = "not an array";
      const invalidGenre = 123;
      
      // Act and Assert
      expect(() => bookSelection.suitableTitles(invalidBooks, "Thriller")).to.throw("Invalid input");
      expect(() => bookSelection.suitableTitles([], invalidGenre)).to.throw("Invalid input");
    });
  });
});




