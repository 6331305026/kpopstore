<template>
  <v-app id="contact">
    <div class="bg-sub">
      <v-content>
        <v-container class="fill-height" fluid>
          <v-row>
            <v-col>
              <div class="sub mb-4">
                <h1 class="display-1 mt-14 mb-4 black--text text-center">
                  Subscribe For More Info<v-spacer></v-spacer>
                  and update from K-POP market
                </h1>
                <v-form>
                    <v-row justify="center">
                      <v-col cols="12" sm="6" md="5">
                        <v-row justify="center" class="mt-1">
                          <v-text-field
                            label="Subscribe For More Info"
                            placeholder="Subscribe For More Info"
                            filled
                            rounded
                            dense
                            prepend-icon="mdi-email"
                            color="primary"
                          >
                          </v-text-field>
                          <v-btn
                            rounded
                            outlined
                            x-large
                            color="black"
                            text
                            to="/"
                          >
                            <span>Subsribe</span>
                          </v-btn>
                        </v-row>
                      </v-col>
                    </v-row>
                </v-form>
              </div>
            </v-col>
          </v-row>
        </v-container>
      </v-content>
  <!-- Footer -->
  <v-footer color="white" class="font-small mt-16 pt-3" height="auto">
    <v-container class="text-center text-md-left">
      <v-row class="text-center text-md-left mt-3 pb-3">
        <v-col md="3" lg="3" xl="3" class="mx-auto mt-3">
          <v-btn icon rounded @click="$vuetify.goTo('#home')" class="mx-auto ml-3 mb-4">
            <v-img
            class=""
            src="/logo.png"
            max-height="75px"
            max-width="75px"
            alt="logo"
            contain
          ></v-img></v-btn>
          <!-- <h6 class="text-uppercase mb-4 font-weight-bold">Company name</h6> -->
          <p class="mt-3 pb-6">&copy; {{ new Date().getFullYear() }} Country/Region: Thailand</p>
          <!-- <v-col md="8"> -->
          <p class="text-center text-md-left">Community :</p>
          <!-- </v-col> -->
        <!-- <v-col class="d-flex align-items-center"> -->
          <v-btn icon class="mr-3" href="https://play.google.com/store/apps/details?id=com.Drug.Interaction">
            <v-img src="/facebook.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
          <v-btn icon class="mr-3" href="https://play.google.com/store/apps/details?id=com.Drug.Interaction">
            <v-img src="/instagram.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
          <v-btn icon class="mr-3" href="https://play.google.com/store/apps/details?id=com.Drug.Interaction">
            <v-img src="/twitter.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
          <v-btn icon class="mr-3" href="https://play.google.com/store/apps/details?id=com.Drug.Interaction">
            <v-img src="/pinterest.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
        <!-- </v-col> -->
        </v-col>
        <!-- <hr class="w-100 clearfix d-md-none" /> -->
        <v-col md="2" lg="2" xl="2" class="mx-auto mt-3">
          <h5 class="mb-4 font-weight-medium" to="/user-info">MY ACCOUNT</h5>
          <p><a href="/user-info">MY ACCOUNT</a></p>
          <p><a href="/shop-card">MY ORDERS</a></p>
          <p><a href="/store">WISH LIST</a></p>
          <p><a href="/admin">ADMIN</a></p>
        </v-col>
        <!-- <hr class="w-100 clearfix d-md-none" /> -->
        <v-col md="3" lg="2" xl="2" class="mx-auto mt-3">
          <h5 class="mb-4 font-weight-medium">BROWSE CATEGORIES</h5>
          <p><a href="/store">Store</a></p>
          <p><a href="/store">Top Sellers</a></p>
          <p><a href="/store">New Releases</a></p>
          <p><a href="/store">Coming Soon</a></p>
        </v-col>
        <!-- <hr class="w-100 clearfix d-md-none" /> -->
        <v-col md="4" lg="3" xl="3" class="mx-auto mt-3">
          <h5 class="mb-4 font-weight-medium">CONTACT US</h5>
          <p>CUSTOMER SERVICE</p>
          <p>SUPPORT@GMKEYS.COM</p>
          <p>+1 (666) 235-6789</p>
        </v-col>
      </v-row>
    </v-container>
  </v-footer>
  <!-- Footer -->
    </div>
  </v-app>
</template>

<style>
.bg-sub {
  height: 100%;
  width: 100vw;
  position: relative;
  background-size: cover;
  background-position: 50% 50%;
  background-image: url("/bgkp.png");
}
footer {
  background-image: url("/footer.png");
  background-position: center center;
  background-repeat: no-repeat;
  background-size: cover;
}
a {
  text-decoration: unset;
}
h5 {
  text-shadow: 3px 3px 3px rgba(0, 0, 0, 0.15);
}
p {
  text-shadow: 3px 3px 3px rgba(0, 0, 0, 0.15);
}
</style>