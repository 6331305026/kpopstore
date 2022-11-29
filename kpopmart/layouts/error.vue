<template>
  <v-app id="404error">
    <div class="bg-error">
      <div class="page-title text-center px-5 my-12">
        <h2
          class="
            text-2xl
            font-weight-semibold
            text--primary
            d-flex
            align-center
            justify-center
          "
        >
          <span class="me-2">Page Not Found</span>
          <v-icon color="warning"> mdi-alert </v-icon>
        </h2>
        <p class="text-sm">we couldn't find the page you are looking for</p>
        <div class="misc-character d-flex justify-center">
          <v-img max-width="700" src="/error.png"></v-img>
        </div>
        <v-btn rounded dark to="/" class="cute2 mb-4 mt-5">
          Back to home
        </v-btn>
      </div>
    </div>
  </v-app>
</template>

<style>
.bg-error {
  height: 100vh;
  width: 100%;
  position: relative;
  background-size: cover;
  background-position: 50% 50%;
  background-image: url("/bg-error.jpg");
}
.cute2 {
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  background: linear-gradient(
      0deg,
      rgba(255, 255, 255, 0.2),
      rgba(255, 255, 255, 0.2)
    ),
    linear-gradient(90.72deg, #9293ff 16.46%, #ff90c9 100%);
}
</style>