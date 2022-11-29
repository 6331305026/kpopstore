<template>
  <v-menu offset-y>
    <template v-slot:activator="{ on, attrs }">
      <v-btn rounded outlined text class="mr-3" v-bind="attrs" v-on="on">
      Shop<v-icon class="">mdi-menu-down</v-icon>
      </v-btn>
    </template>
    <v-list>
      <v-list-item v-for="(item, index) in items" :key="index" :to="item.to">
        <v-list-item-title>{{ item.title }}</v-list-item-title>
      </v-list-item>
    </v-list>
  </v-menu>
</template>

<script>
export default {
  data: () => ({
    items: [
    //   { title: "Shop", to: "/shop" },
      { title: "More", to: "/store" },
    ],
  }),
};
</script>