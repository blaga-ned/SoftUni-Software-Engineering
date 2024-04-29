class Garden {
  constructor(spaceAvailable) {
    this.spaceAvailable = spaceAvailable;
    this.plants = [];
    this.storage = [];
  }

  addPlant(plantName, spaceRequired) {
    if (spaceRequired > this.spaceAvailable) {
      throw new Error("Not enough space in the garden.");
    } else {
      this.plants.push({
        plantName,
        spaceRequired,
        ripe: false,
        quantity: 0,
      });
      this.spaceAvailable -= spaceRequired;
      return `The ${plantName} has been successfully planted in the garden.`;
    }
  }

  ripenPlant(plantName, quantity) {
    if (quantity <= 0) {
      throw new Error("The quantity cannot be zero or negative.");
    }

    const plant = this.findPlantByName(plantName);

    if (!plant) {
      throw new Error(`There is no ${plantName} in the garden.`);
    }

    if (plant.ripe) {
      throw new Error(`The ${plantName} is already ripe.`);
    }

    plant.ripe = true;
    plant.quantity += quantity;

    if (quantity === 1) {
      return `${quantity} ${plantName} has successfully ripened.`;
    } else {
      return `${quantity} ${plantName}s have successfully ripened.`;
    }
  }

  harvestPlant(plantName) {
    const plantIndex = this.findPlantIndexByName(plantName);

    if (plantIndex === -1) {
      throw new Error(`There is no ${plantName} in the garden.`);
    }

    const plant = this.plants[plantIndex];

    if (!plant.ripe) {
      throw new Error(
        `The ${plantName} cannot be harvested before it is ripe.`
      );
    }

    this.storage.push({
      plantName,
      quantity: plant.quantity,
    });

    this.plants.splice(plantIndex, 1);
    this.spaceAvailable += plant.spaceRequired;

    return `The ${plantName} has been successfully harvested.`;
  }

  generateReport() {
    let report = `The garden has ${this.spaceAvailable} free space left.\n`;

    const sortedPlants = this.plants
      .map((plant) => plant.plantName)
      .sort()
      .join(", ");

    report += `Plants in the garden: ${sortedPlants}\n`;

    if (this.storage.length === 0) {
      report += "Plants in storage: The storage is empty.";
    } else {
      const storagePlants = this.storage
        .map((plant) => `${plant.plantName} (${plant.quantity})`)
        .join(", ");
      report += `Plants in storage: ${storagePlants}`;
    }

    return report;
  }

  findPlantByName(plantName) {
    return this.plants.find((plant) => plant.plantName === plantName);
  }

  findPlantIndexByName(plantName) {
    return this.plants.findIndex((plant) => plant.plantName === plantName);
  }
}
