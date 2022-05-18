import java.util.ArrayList;

/*
 * Copyright (C) 2020 Dantes
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
/**
 *
 * @author Dantes
 */
public class RecipeBook {

    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void printByName(String name) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {
                if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(e);
                }
            }
        }
    }

    public void printByTime(String time) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {

                if (e.getTime() <= Integer.valueOf(time)) {
                    System.out.println(e);
                }
            }
        }
    }

    public void printByIngredient(String ingredient) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {
                if (e.getIngredients().contains(ingredient.toLowerCase())) {
                    System.out.println(e);
                }
            }
        }
    }
    public void printRecipeBook() {
        for (Recipe e : this.recipes) {
            System.out.println(e);
        }
    }
}