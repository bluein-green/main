package seedu.address.model;

import java.util.ArrayList;
import java.util.List;

import seedu.address.model.ingredient.IceCream;
import seedu.address.model.ingredient.Ingredient;
import seedu.address.model.ingredient.IngredientQuantity;
import seedu.address.model.ingredient.Topping;


/**
 * Represents the list of ingredients in the store
 */
public class IngredientManager implements IngredientModel {
    private List<Topping> toppings;
    private List<IceCream> iceCreams;

    public IngredientManager() {
        // TODO: for now, always create new lists (i.e. doesn't save data yet)
        toppings = new ArrayList<>();
        iceCreams = new ArrayList<>();
    }


    @Override
    public void resetData() {
        toppings.clear();
        iceCreams.clear();
    }

    @Override
    public List<Ingredient> getAllIngredientsList() {
        // TODO: return an immutable list in the future
        List<Ingredient> allIngredients = new ArrayList<>();
        allIngredients.addAll(iceCreams);
        allIngredients.addAll(toppings);

        return allIngredients;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        // check if it is duplicate
        

        if (ingredient instanceof IceCream) {

        }

    }

    @Override
    public void updateIngredientQuantity(Ingredient ingredient, IngredientQuantity quantity) {
        ingredient.setQuantity(quantity);
    }

    @Override
    public void deleteIngredient(Ingredient ingredient) {

    }

    @Override
    public boolean hasIngredient(Ingredient ingredient) {
        return false;
    }

}
