<template>
  <nav>
    <!-- navigated-left-bar -->
    <v-navigation-drawer
      v-model="drawer"
      app
      temporary
      dark
      src="/bgnm2.png"
      :search="search"
    >
      <v-list>
        <v-list-item>
          <v-list-item-avatar>
            <v-btn icon rounded to="/">
              <v-img src="/logo2.svg" max-height="45px" max-width="45px" alt="Logo" />
            </v-btn>
          </v-list-item-avatar>
          <v-list-item-content>
            <v-list-item-title class="title">Username</v-list-item-title>
            <v-list-item-subtitle>#User001</v-list-item-subtitle>
          </v-list-item-content>
        </v-list-item>
      </v-list>

      <v-divider />

      <v-list dense>
        <v-list-item
          v-for="([icon, text, link], i) in items"
          :key="i"
          link
          @click="$vuetify.goTo(link)"
        >
          <v-list-item-icon class="justify-center">
            <v-icon>{{ icon }}</v-icon>
          </v-list-item-icon>
          <v-list-item-content>
            <v-list-item-title class="subtitile-1">{{
              text
            }}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>
    <!-- navigated-left-bar-end -->

    <!-- navigated-top-bar -->
    <v-app-bar app dark color="#FEB0DA">
      <v-toolbar-title>
        <!-- logo -->
        <v-btn
          icon
          rounded
          class="ml-16"
          to="/"
        >
          <v-img src="/logo.svg" max-height="50px" max-width="50px" alt="Logo" />
        </v-btn>
      </v-toolbar-title>
      <v-spacer></v-spacer>

      <v-app-bar-nav-icon
        @click.stop="drawer = !drawer"
        class="mr-4"
        v-if="isXs"
      />

      <v-btn
        rounded
        outlined
        text
        to="/"
        class="mr-3 ml-3"
      >
        <span class="mr-1">Home</span>
      </v-btn>

      <v-btn rounded outlined text to="/" class="mr-3">
        <span class="mr-1">About us</span>
      </v-btn>
      <shop-list />
      <!-- <v-btn rounded outlined text @click="$vuetify.goTo('#shop')" class="mr-3">
        <span class="mr-1">Shop </span>
      </v-btn> -->

      <v-btn rounded outlined text to="/" class="mr-3">
        <span class="mr-1">Contact us</span>
      </v-btn>
      <!-- <v-btn rounded outlined text to="/login" class="mr-3">
        <span class="mr-1">Login</span>
      </v-btn> -->
      <!-- <v-spacer></v-spacer> -->
      <!-- search-bar -->
      <v-text-field
        v-model="search"
        label="Search"
        rounded
        dense
        outlined
        prepend-inner-icon="mdi-magnify"
        class="app-bar-search flex-grow-0"
        hide-details
        placeholder="Find a match ..."
      ></v-text-field>
      <wish-button />
      <cart-button />
      <avatar />
    </v-app-bar>
  </nav>
</template>

<style>
nav {
  font-family: Roboto;
}
</style>

// nav-left-bar
<style scoped>
.v-toolbar {
  transition: 0.6s;
}

.expand {
  height: 80px !important;
  padding-top: 10px;
}
</style>

<style lang="scss">
.user-profile-menu-content {
  .v-list-item {
    min-height: 2.5rem !important;
  }
}
</style>

// nav-left-bar
<script>
export default {
  data: () => ({
    search:'',
    drawer: null,
    isXs: false,
    items: [
      ["mdi-home-outline", "Home", "#home"],
      ["mdi-information-outline", "About us", "#about"],
      ["mdi-store-outline", "Shop", "#shop"],
      ["mdi-email-outline", "Contact", "#contact"],
      ["mdi-log-in-outline", "Log in", "#login"],
    ],
  }),
  props: {
    color: String,
    flat: Boolean,
  },
  methods: {
    onResize() {
      this.isXs = window.innerWidth < 850;
    },
  },

  watch: {
    isXs(value) {
      if (!value) {
        if (this.drawer) {
          this.drawer = false;
        }
      }
    },
  },
  mounted() {
    this.onResize();
    window.addEventListener("resize", this.onResize, { passive: true });
  },
};
</script>
