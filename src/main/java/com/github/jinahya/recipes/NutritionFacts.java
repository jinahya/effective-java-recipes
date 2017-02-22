/*
 * Copyright 2017 Jin Kwon &gt;onacit@gmail.com&lt;.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jinahya.recipes;

public class NutritionFacts {

    public static class Builder
        implements com.github.jinahya.recipes.Builder<NutritionFacts> {

        public Builder(final int servingSize, final int servings) {
            super();
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(final int val) {
            calories = val;
            return this;
        }

        public Builder fat(final int val) {
            fat = val;
            return this;
        }

        public Builder carbohydrate(final int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(final int val) {
            sodium = val;
            return this;
        }

        @Override
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

        // Required parameters
        private final int servingSize;

        private final int servings;

        // Optional parameters - initialized to default values
        private int calories = 0;

        private int fat = 0;

        private int carbohydrate = 0;

        private int sodium = 0;
    }

    // -------------------------------------------------------------------------
    private NutritionFacts(final Builder builder) {
        super();
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    // -------------------------------------------------------------------------
    public NutritionFacts(final int servingSize, final int servings,
                          final int calories, final int fat, final int sodium,
                          final int carbohydrate) {
        super();
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public NutritionFacts(final int servingSize, final int servings,
                          final int calories, final int fat, final int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(final int servingSize, final int servings,
                          final int calories, final int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(final int servingSize, final int servings,
                          final int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(final int servingSize, final int servings) {
        this(servingSize, servings, 0);
    }

    // ------------------------------------------------------------- servingSize
    public int getServingSize() {
        return servingSize;
    }

    // ---------------------------------------------------------------- servings
    public int getServings() {
        return servings;
    }

    // ---------------------------------------------------------------- calories
    public int getCalories() {
        return calories;
    }

    // --------------------------------------------------------------------- fat
    public int getFat() {
        return fat;
    }

    // ------------------------------------------------------------------ sodium
    public int getSodium() {
        return sodium;
    }

    // ------------------------------------------------------------- cabohydrate
    public int getCarbohydrate() {
        return carbohydrate;
    }

    // -------------------------------------------------------------------------
    private final int servingSize; // (mL) required

    private final int servings; // (per container) required

    private final int calories; // optional

    private final int fat; // (g) optional

    private final int sodium; // (mg) optional

    private final int carbohydrate; // (g) optional
}
