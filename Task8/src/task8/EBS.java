
package task8;

public class EBS {
    private Recipe provedRecipe [];
    private int recipeNo = 0;
    private int maxRecipe;
    
    public EBS( ) {
        int maxRecipe = 100;
        provedRecipe = new Recipe[maxRecipe];
    }

    
    private void maximize() {
        Recipe newRecipes[] = new Recipe[maxRecipe*2];
        for( int i=0; i<maxRecipe; i++ )
            newRecipes[i] = provedRecipe[i];
        provedRecipe = newRecipes;
        maxRecipe *= 2;
    }
    
    public Recipe searchRecipe(String recipeNo){
        for(Recipe recipe:provedRecipe){
            if(recipe.getRecipeno().equalsIgnoreCase(recipeNo)){
                return recipe;
            }
        }
        return null;
    }
    
    public boolean check(Recipe recipe){
        if(searchRecipe(recipe.getRecipeno()) == recipe)
            return true;
        return false;
    }
    
    public void addRecipe(Recipe recipe){
        if(recipeNo == maxRecipe)
            maximize();
        if(check(recipe))
            return;
        provedRecipe[recipeNo] = recipe;
        recipeNo ++;
    }
    
}


