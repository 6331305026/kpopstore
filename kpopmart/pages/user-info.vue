<template>
  <v-app id="contact">
    <navbar-store />
    <div class="bg-user">
      <v-content>
        <v-container class="fill-height" fluid>
          <v-row align="center" justify="center">
            <v-col col="12" md="10">
              <div class="user">
                <div class="title">
                  <v-row>
                    <v-icon class="mt-6 mr-4">mdi-account-circle</v-icon>
                    <p class="font-weight-regular mt-11 mr-4">|</p>
                    <p class="font-weight-regular mt-11">User Information</p>
                  </v-row>
                </div>
                <div class="profile">
                  <p class="font-weight-regular mt-11 mr-6 blue-grey--text">
                    Profile
                  </p>
                  <v-container fluid>
                    <v-row>
                      <v-col md="1">
                        <v-avatar size="150px">
                          <v-img src="/1.png" />
                        </v-avatar>
                      </v-col>
                      <v-col md="4" class="mt-1 ml-16">
                        <p
                          class="
                            font-weight-regular
                            mt-2
                            mr-6
                            ml-6
                            blue-grey--text
                          "
                        >
                          Profile Picture
                        </p>
                        <v-row class="ml-6 mt-2">
                          <p class="font-weight-light mr-4 blue-grey--text">
                            #0001
                          </p>
                          <p class="font-weight-light blue-grey--text">
                            TDN_08
                          </p>
                        </v-row>
                        <v-row class="ml-6 mt-2">
                          <v-btn
                          color="#9293FF"
                          @click="$refs.refInputEl.click()"
                        >
                          <input
                            ref="refInputEl"
                            type="file"
                            accept=".jpeg,.png,.jpg,GIF"
                            :hidden="true"
                          />
                          <span class="d-none d-sm-block white--text"
                            >Upload photo</span>
                        </v-btn>
                        <v-btn
                          color="error"
                          outlined
                          class="ml-4"
                        >
                          Reset
                        </v-btn>
                        </v-row>
                          <p class="grey--text text-sm-body-2 mt-6 ml-7">
                            Allowed JPG, GIF or PNG. Max size of 800K
                          </p>
                      </v-col>
                    </v-row>
                    
                  </v-container>
                  <!-- <v-card flat class="pa-3 mt-2"> 
                  </v-card> -->
                </div>
                <div class="detail">
                  <p class="font-weight-regular mt-11 mr-6 blue-grey--text">
                    Detail
                  </p>
                  <v-container fluid>
                    <!-- infomation -->
                    <v-row>
                      <v-col cols="1">
                        <p
                          class="font-weight-regular mt-2 mr-6 ml-6 grey--text"
                        >
                          Username
                        </p>
                      </v-col>
                      <v-col cols="12" sm="6" md="4">
                        <v-text-field
                          class="ml-4"
                          rounded
                          outlined
                          hint="This will be how your name will be displayed in the account"
                          persistent-hint
                          value="TDN_8"
                          readonly
                        ></v-text-field>
                      </v-col>
                    </v-row>
                    <v-row>
                      <v-col cols="1">
                        <p
                          class="font-weight-regular mt-2 mr-6 ml-6 grey--text"
                        >
                          Firstname
                        </p>
                      </v-col>
                      <v-col cols="12" sm="6" md="4">
                        <v-text-field
                          value="John"
                          hide-details
                          class="ml-4"
                          rounded
                          outlined
                          readonly
                        ></v-text-field>
                      </v-col>
                    </v-row>
                    <v-row>
                      <v-col cols="1">
                        <p
                          class="font-weight-regular mt-2 mr-6 ml-6 grey--text"
                        >
                          Lastname
                        </p>
                      </v-col>
                      <v-col cols="12" sm="6" md="4">
                        <v-text-field
                          value="Doe"
                          hide-details
                          class="ml-4"
                          rounded
                          outlined
                          readonly
                        ></v-text-field>
                      </v-col>
                    </v-row>
                    <v-row>
                      <v-col cols="1">
                        <p
                          class="font-weight-regular mt-2 mr-6 ml-6 grey--text"
                        >
                          Email
                        </p>
                      </v-col>
                      <v-col cols="12" sm="6" md="4">
                        <v-text-field
                          value="Gamekeys@gmail.com"
                          class="ml-4"
                          rounded
                          outlined
                          hint="The system will send the product to this email. Please check your email carefully"
                          persistent-hint
                          readonly
                        ></v-text-field>
                      </v-col>
                    </v-row>
                    <!-- infomation -->
                  </v-container>
                  <div class="password">
                    <p class="font-weight-regular mt-11 mr-6 blue-grey--text">
                      Password Change
                    </p>
                    <v-container fluid>
                      <!-- current-password -->
                      <v-row>
                        <v-col cols="1">
                          <p
                            class="
                              font-weight-regular
                              mt-2
                              mr-6
                              ml-6
                              grey--text
                            "
                          >
                            Current password
                          </p>
                        </v-col>
                        <v-col cols="12" sm="6" md="3">
                          <v-text-field
                            v-model="currentPassword"
                            :type="
                              isCurrentPasswordVisible ? 'text' : 'password'
                            "
                            :append-icon="
                              isCurrentPasswordVisible
                                ? 'mdi-eye'
                                : 'mdi-eye-off'
                            "
                            :rules="[rules.required, rules.min]"
                            label="Current Password"
                            outlined
                            rounded
                            class="ml-4"
                            hint="leave blank to leave unchanged"
                            persistent-hint
                            @click:append="
                              isCurrentPasswordVisible =
                                !isCurrentPasswordVisible
                            "
                          ></v-text-field>
                        </v-col>
                      </v-row>
                      <!-- new-password -->
                      <v-row>
                        <v-col cols="1">
                          <p
                            class="
                              font-weight-regular
                              mt-2
                              mr-6
                              ml-6
                              grey--text
                            "
                          >
                            New password
                          </p>
                        </v-col>

                        <v-col cols="12" sm="6" md="3">
                          <v-text-field
                            v-model="newPassword"
                            :type="isNewPasswordVisible ? 'text' : 'password'"
                            :append-icon="
                              isNewPasswordVisible ? 'mdi-eye' : 'mdi-eye-off'
                            "
                            :rules="[rules.required, rules.min]"
                            label="New Password"
                            outlined
                            rounded
                            class="ml-4"
                            hint="leave blank to leave unchanged"
                            persistent-hint
                            @click:append="
                              isNewPasswordVisible = !isNewPasswordVisible
                            "
                          ></v-text-field>
                        </v-col>
                      </v-row>
                      <!-- confirm-password -->
                      <v-row>
                        <v-col cols="1">
                          <p
                            class="
                              font-weight-regular
                              mt-2
                              mr-6
                              ml-6
                              grey--text
                            "
                          >
                            Confirm password
                          </p>
                        </v-col>
                        <v-col cols="12" sm="6" md="3">
                          <v-text-field
                            v-model="cPassword"
                            :type="isCPasswordVisible ? 'text' : 'password'"
                            :append-icon="
                              isCPasswordVisible ? 'mdi-eye' : 'mdi-eye-off'
                            "
                            :rules="[rules.required, rules.PasswordMatch]"
                            label="Confirm New Password"
                            outlined
                            rounded
                            class="ml-4"
                            @click:append="
                              isCPasswordVisible = !isCPasswordVisible
                            "
                          ></v-text-field>
                        </v-col>
                      </v-row>
                      <!-- action buttons -->
                      <v-card-text>
                        <v-btn color="error" outlined class="mr-3" rounded>
                          Cancel
                        </v-btn>
                        <v-btn color="cute2 primary" class="me-3" rounded>
                          Save changes
                        </v-btn>
                      </v-card-text>
                    </v-container>
                  </div>
                </div>
              </div>
            </v-col>
          </v-row>
        </v-container>
      </v-content>
    </div>
    <!-- Footer -->
  <v-footer color="white" class="font-small " height="auto">
    <v-container class="text-center text-md-left">
      <v-row class="text-center text-md-left mt-3 pb-3">
        <v-col md="3" lg="3" xl="3" class="mx-auto mt-3">
          <v-btn icon rounded to="/" class="mx-auto ml-3 mb-4">
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
          <v-btn icon class="mr-3" to="">
            <v-img src="/facebook.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
          <v-btn icon class="mr-3" to="">
            <v-img src="/instagram.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
          <v-btn icon class="mr-3" to="">
            <v-img src="/twitter.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
          <v-btn icon class="mr-3" to="">
            <v-img src="/pinterest.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
        <!-- </v-col> -->
        </v-col>
        <!-- <hr class="w-100 clearfix d-md-none" /> -->
        <v-col md="2" lg="2" xl="2" class="mx-auto mt-3">
          <h5 class="mb-4 font-weight-medium">MY ACCOUNT</h5>
          <p><a href="/user-info">MY ACCOUNT</a></p>
          <p><a href="/error">MY ORDERS</a></p>
          <p><a href="/error">WISH LIST</a></p>
          <p><a href="/admin">ADMIN</a></p>
        </v-col>
        <!-- <hr class="w-100 clearfix d-md-none" /> -->
        <v-col md="3" lg="2" xl="2" class="mx-auto mt-3">
          <h5 class="mb-4 font-weight-medium">BROWSE CATEGORIES</h5>
          <p><a href="/store">Store</a></p>
          <p><a href="/store">Top Sellers</a></p>
          <p><a href="/store">New Releases</a></p>
          <p><a href="/error">Coming Soon</a></p>
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
  </v-app>
</template>

<style>
.bg-user {
  height: 100vw;
  width: 100vw;
  position: relative;
  background-size: cover;
  background-position: 50% 50%;
  background-image: url("/bg-shop.png");
}
.cute2 {
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  background: linear-gradient(0deg, rgba(255, 255, 255, 0.2), rgba(255, 255, 255, 0.2)), linear-gradient(90.72deg, #9293FF 16.46%, #FF90C9 100%);
}
</style>

<script>
export default {
  data() {
    return {
      isCurrentPasswordVisible: false,
      isNewPasswordVisible: false,
      isCPasswordVisible: false,
      password: "Password",
      rules: {
        required: (value) => !!value || "Required.",
        // min: v => v.length >= 8 || "Min 8 characters",
        PasswordMatch: () => `The password you entered don't match`,
      },
    };
  },
};
</script>
