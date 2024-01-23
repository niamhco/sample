package Sample;

public class TacoShop {


    public String orderTacos(TacoType.TacoTypes tacoType, Ingredients ingredients) {
        String taco = "";
        switch (tacoType) {
            case BURRITO:
                taco = orderBurrito(ingredients);
                break;
            case ENCHILADA:
                taco = orderEnchilada(ingredients);
                break;
            case QUESADILLA:
                taco = orderQuesadilla(ingredients);
                break;
            case TACO:
                taco = orderTaco(ingredients);
                break;
        }
        return taco;
    }

    public String orderBurrito(Ingredients ingredients) {

        String  burrito = ingredients.getTortilla() + " " + ingredients.getBeef() + " " + ingredients.getCheese();
        return burrito;
    }

    public String orderTaco(Ingredients ingredients) {

        String  taco = ingredients.getTortilla() + " " + ingredients.getBeef() + " " + ingredients.getCheese();
        return taco;
    }

    public String orderEnchilada(Ingredients ingredients) {

        String  enchilada = ingredients.getTortilla() + " " + ingredients.getChicken() + " " + ingredients.getCheese();
        return enchilada;
    }

    public String orderQuesadilla(Ingredients ingredients) {

        String  quesadilla = ingredients.getTortilla() + " " + ingredients.getChicken() + " " + ingredients.getCheese();
        return quesadilla;
    }
}

