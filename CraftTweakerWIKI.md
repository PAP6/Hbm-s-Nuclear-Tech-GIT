# <u>**HBM Nuclear Tech Mod - 1.12.2 Extended Edition**</u>

CraftTweaker Integration

### **Assembler**

mods.ntm.Assembler.addRecipe(IItemStack output, IItemStack[] inputs, int duration);
mods.ntm.Assembler.removeRecipe(IItemStack output);

mods.ntm.Assembler.addRecipe(<minecraft:beef>, [<minecraft:cooked_beef>*4, <minecraft:egg>*6], 30);
mods.ntm.Assembler.removeRecipe(<hbm:machine_silex>);


### **RBMK Irradiation Channel**

mods.ntm.IrradiationChannel.addRecipe(IItemStack input, IItemStack output, int requiredFlux);
mods.ntm.IrradiationChannel.removeRecipe(IItemStack input);

mods.ntm.IrradiationChannel.addRecipe(<minecraft:beef>, <minecraft:egg>, 30000);
mods.ntm.IrradiationChannel.removeRecipe(<hbm:ingot_strontium>);


### **Breeding Reactor**

mods.ntm.BreedingReactor.addRecipe(IItemStack input, IItemStack output, int heat);
mods.ntm.BreedingReactor.removeRecipe(IItemStack input);

mods.ntm.BreedingReactor.addRecipe(<minecraft:beef>, <minecraft:cooked_beef>, 3);
mods.ntm.BreedingReactor.removeRecipe(<hbm:rod_pu239>);


mods.ntm.BreedingReactor.addRecipe(IItemStack fuel, int heat, int usesInNuclearFurnace);
mods.ntm.BreedingReactor.removeRecipe(IItemStack fuel);

mods.ntm.BreedingReactor.addFuel(<minecraft:dirt>, 4, 100);
mods.ntm.BreedingReactor.removeFuel(<hbm:rod_polonium>);


### **Blast Furnace**

mods.ntm.BlastFurnace.addRecipe(IItemStack input1, IItemStack input2, IItemStack output);
mods.ntm.BlastFurnace.removeRecipe(IItemStack input1, IItemStack input2);

mods.ntm.BlastFurnace.addRecipe(<minecraft:beef>, <minecraft:stick>, <minecraft:cooked_beef>);
mods.ntm.BlastFurnace.removeRecipe(<minecraft:beef>, <minecraft:stick>);

mods.ntm.BlastFurnace.addFuel(IItemStack fuel, int fuelAmount);
mods.ntm.BlastFurnace.removeFuel(IItemStack fuel);

mods.ntm.BlastFurnace.addFuel(<minecraft:stick>, 4000);
mods.ntm.BlastFurnace.removeFuel(<hbm:solid_fuel>);